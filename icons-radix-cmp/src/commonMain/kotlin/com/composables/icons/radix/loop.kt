package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Loop: ImageVector
    get() {
        if (_Loop != null) return _Loop!!
        
        _Loop = ImageVector.Builder(
            name = "loop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.49996f, 7.00021f)
                curveTo(1.7761f, 7.00021f, 1.99996f, 7.22406f, 1.99996f, 7.50021f)
                curveTo(1.99996f, 9.4332f, 3.56697f, 11.0002f, 5.49996f, 11.0002f)
                horizontalLineTo(12.7929f)
                lineTo(11.6464f, 9.85372f)
                lineTo(11.582f, 9.7756f)
                curveTo(11.4538f, 9.58152f, 11.4756f, 9.31756f, 11.6464f, 9.14669f)
                curveTo(11.8173f, 8.97583f, 12.0813f, 8.95407f, 12.2754f, 9.08224f)
                lineTo(12.3535f, 9.14669f)
                lineTo(14.3535f, 11.1467f)
                curveTo(14.5487f, 11.342f, 14.5487f, 11.6585f, 14.3535f, 11.8537f)
                lineTo(12.3535f, 13.8537f)
                curveTo(12.1582f, 14.049f, 11.8417f, 14.049f, 11.6464f, 13.8537f)
                curveTo(11.4512f, 13.6585f, 11.4512f, 13.342f, 11.6464f, 13.1467f)
                lineTo(12.7929f, 12.0002f)
                horizontalLineTo(5.49996f)
                curveTo(3.01468f, 12.0002f, 0.999962f, 9.98549f, 0.999962f, 7.50021f)
                curveTo(0.999962f, 7.22406f, 1.22382f, 7.00021f, 1.49996f, 7.00021f)
                close()
                moveTo(2.72457f, 1.08224f)
                curveTo(2.91865f, 0.954074f, 3.18261f, 0.975828f, 3.35348f, 1.14669f)
                curveTo(3.52434f, 1.31756f, 3.5461f, 1.58152f, 3.41793f, 1.7756f)
                lineTo(3.35348f, 1.85372f)
                lineTo(2.20699f, 3.00021f)
                horizontalLineTo(9.49996f)
                curveTo(11.9852f, 3.00021f, 14f, 5.01493f, 14f, 7.50021f)
                curveTo(14f, 7.77635f, 13.7761f, 8.00021f, 13.5f, 8.00021f)
                curveTo(13.2238f, 8.00021f, 13f, 7.77635f, 13f, 7.50021f)
                curveTo(13f, 5.56721f, 11.433f, 4.00021f, 9.49996f, 4.00021f)
                horizontalLineTo(2.20699f)
                lineTo(3.35348f, 5.14669f)
                lineTo(3.41793f, 5.22482f)
                curveTo(3.5461f, 5.4189f, 3.52434f, 5.68286f, 3.35348f, 5.85372f)
                curveTo(3.18261f, 6.02459f, 2.91865f, 6.04634f, 2.72457f, 5.91818f)
                lineTo(2.64645f, 5.85372f)
                lineTo(0.646447f, 3.85372f)
                curveTo(0.451184f, 3.65846f, 0.451184f, 3.34195f, 0.646447f, 3.14669f)
                lineTo(2.64645f, 1.14669f)
                lineTo(2.72457f, 1.08224f)
                close()
            }
        }.build()
        
        return _Loop!!
    }

private var _Loop: ImageVector? = null

