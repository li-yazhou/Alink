package com.alibaba.alink.params.onlinelearning;

import org.apache.flink.ml.api.misc.param.ParamInfo;
import org.apache.flink.ml.api.misc.param.ParamInfoFactory;
import org.apache.flink.ml.api.misc.param.WithParams;

import com.alibaba.alink.params.shared.colname.HasLabelCol;
import com.alibaba.alink.params.shared.colname.HasVectorColDefaultAsNull;
import com.alibaba.alink.params.shared.linear.HasPositiveLabelValueString;

public interface FtrlModelFilterParams<T> extends WithParams <T>,
	HasLabelCol <T>,
	HasVectorColDefaultAsNull <T>,
	HasPositiveLabelValueString<T> {

	ParamInfo <Double> AUC_THRESHOLD = ParamInfoFactory
		.createParamInfo("aucThreshold", Double.class)
		.setDescription("auc threshold")
		.setHasDefaultValue(0.5)
		.build();

	default Double getAucThreshold() {return get(AUC_THRESHOLD);}

	default T setAucThreshold(Double value) {return set(AUC_THRESHOLD, value);}

	ParamInfo <Double> ACCURACY_THRESHOLD = ParamInfoFactory
		.createParamInfo("accuracyThreshold", Double.class)
		.setDescription("accuracy threshold")
		.setHasDefaultValue(0.5)
		.build();

	default Double getAccuracyThreshold() {return get(ACCURACY_THRESHOLD);}

	default T setAccuracyThreshold(Double value) {return set(ACCURACY_THRESHOLD, value);}
}
