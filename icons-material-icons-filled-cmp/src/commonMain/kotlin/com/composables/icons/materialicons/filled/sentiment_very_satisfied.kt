package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sentiment_very_satisfied: ImageVector
    get() {
        if (_Sentiment_very_satisfied != null) return _Sentiment_very_satisfied!!
        
        _Sentiment_very_satisfied = ImageVector.Builder(
            name = "sentiment_very_satisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
                moveToRelative(-5f, -6f)
                curveToRelative(0.78f, 2.34f, 2.72f, 4f, 5f, 4f)
                reflectiveCurveToRelative(4.22f, -1.66f, 5f, -4f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Sentiment_very_satisfied!!
    }

private var _Sentiment_very_satisfied: ImageVector? = null

