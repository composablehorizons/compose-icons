package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sentiment_very_satisfied: ImageVector
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
                moveToRelative(1f, -10.06f)
                lineTo(14.06f, 11f)
                lineToRelative(1.06f, -1.06f)
                lineTo(16.18f, 11f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(13f, 9.94f)
                close()
                moveToRelative(-4.12f, 0f)
                lineTo(9.94f, 11f)
                lineTo(11f, 9.94f)
                lineTo(8.88f, 7.82f)
                lineTo(6.76f, 9.94f)
                lineTo(7.82f, 11f)
                lineToRelative(1.06f, -1.06f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(2.33f, 0f, 4.31f, -1.46f, 5.11f, -3.5f)
                horizontalLineTo(6.89f)
                curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f)
                close()
            }
        }.build()
        
        return _Sentiment_very_satisfied!!
    }

private var _Sentiment_very_satisfied: ImageVector? = null

