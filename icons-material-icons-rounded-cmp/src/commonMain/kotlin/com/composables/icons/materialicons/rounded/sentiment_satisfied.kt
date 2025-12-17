package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sentiment_satisfied: ImageVector
    get() {
        if (_Sentiment_satisfied != null) return _Sentiment_satisfied!!
        
        _Sentiment_satisfied = ImageVector.Builder(
            name = "sentiment_satisfied",
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
                moveToRelative(4.41f, -6.11f)
                curveToRelative(-0.35f, -0.22f, -0.82f, -0.11f, -1.03f, 0.24f)
                curveToRelative(-0.74f, 1.17f, -2f, 1.87f, -3.38f, 1.87f)
                reflectiveCurveToRelative(-2.64f, -0.7f, -3.38f, -1.88f)
                curveToRelative(-0.22f, -0.35f, -0.68f, -0.46f, -1.03f, -0.24f)
                curveToRelative(-0.35f, 0.22f, -0.46f, 0.68f, -0.24f, 1.03f)
                curveTo(8.37f, 16.54f, 10.1f, 17.5f, 12f, 17.5f)
                reflectiveCurveToRelative(3.63f, -0.97f, 4.65f, -2.58f)
                curveToRelative(0.22f, -0.35f, 0.11f, -0.81f, -0.24f, -1.03f)
                close()
            }
        }.build()
        
        return _Sentiment_satisfied!!
    }

private var _Sentiment_satisfied: ImageVector? = null

