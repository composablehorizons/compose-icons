package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sentiment_very_dissatisfied: ImageVector
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
                curveToRelative(-2.33f, 0f, -4.31f, 1.46f, -5.11f, 3.5f)
                horizontalLineToRelative(10.22f)
                curveToRelative(-0.8f, -2.04f, -2.78f, -3.5f, -5.11f, -3.5f)
                close()
                moveTo(7.82f, 12f)
                lineToRelative(1.06f, -1.06f)
                lineTo(9.94f, 12f)
                lineTo(11f, 10.94f)
                lineTo(9.94f, 9.88f)
                lineTo(11f, 8.82f)
                lineTo(9.94f, 7.76f)
                lineTo(8.88f, 8.82f)
                lineTo(7.82f, 7.76f)
                lineTo(6.76f, 8.82f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-1.06f, 1.06f)
                close()
                moveToRelative(4.17f, -10f)
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
                moveToRelative(4.18f, -12.24f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(13f, 8.82f)
                lineToRelative(1.06f, 1.06f)
                lineTo(13f, 10.94f)
                lineTo(14.06f, 12f)
                lineToRelative(1.06f, -1.06f)
                lineTo(16.18f, 12f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _Sentiment_very_dissatisfied!!
    }

private var _Sentiment_very_dissatisfied: ImageVector? = null

