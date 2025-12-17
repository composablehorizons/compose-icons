package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sentiment_very_dissatisfied: ImageVector
    get() {
        if (_Sentiment_very_dissatisfied != null) return _Sentiment_very_dissatisfied!!
        
        _Sentiment_very_dissatisfied = ImageVector.Builder(
            name = "sentiment_very_dissatisfied",
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
                moveTo(12f, 13.5f)
                curveToRelative(-2.03f, 0f, -3.8f, 1.11f, -4.75f, 2.75f)
                curveToRelative(-0.19f, 0.33f, 0.06f, 0.75f, 0.44f, 0.75f)
                horizontalLineToRelative(8.62f)
                curveToRelative(0.38f, 0f, 0.63f, -0.42f, 0.44f, -0.75f)
                curveToRelative(-0.95f, -1.64f, -2.72f, -2.75f, -4.75f, -2.75f)
                close()
                moveToRelative(-3.65f, -2.03f)
                lineToRelative(0.53f, -0.53f)
                lineToRelative(0.53f, 0.53f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                lineToRelative(-0.53f, -0.53f)
                lineToRelative(0.53f, -0.53f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                lineToRelative(-0.53f, 0.53f)
                lineToRelative(-0.53f, -0.53f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(-0.53f, 0.53f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                close()
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                reflectiveCurveTo(22f, 17.53f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
                moveToRelative(3.65f, -11.71f)
                lineToRelative(-0.53f, 0.53f)
                lineToRelative(-0.53f, -0.53f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(-0.53f, 0.53f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                lineToRelative(0.53f, -0.53f)
                lineToRelative(0.53f, 0.53f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                lineToRelative(-0.53f, -0.53f)
                lineToRelative(0.53f, -0.53f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                close()
            }
        }.build()
        
        return _Sentiment_very_dissatisfied!!
    }

private var _Sentiment_very_dissatisfied: ImageVector? = null

