package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sentiment_neutral: ImageVector
    get() {
        if (_Sentiment_neutral != null) return _Sentiment_neutral!!
        
        _Sentiment_neutral = ImageVector.Builder(
            name = "sentiment_neutral",
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
                moveTo(12f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                reflectiveCurveToRelative(3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                reflectiveCurveToRelative(-3.58f, -8f, -8f, -8f)
                close()
                moveTo(7f, 9.5f)
                curveTo(7f, 8.67f, 7.67f, 8f, 8.5f, 8f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.33f, 11f, 8.5f, 11f)
                reflectiveCurveTo(7f, 10.33f, 7f, 9.5f)
                close()
                moveToRelative(8f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.5f)
                close()
                moveToRelative(0.5f, -4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(14.67f, 8f, 15.5f, 8f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(9f)
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
            }
        }.build()
        
        return _Sentiment_neutral!!
    }

private var _Sentiment_neutral: ImageVector? = null

