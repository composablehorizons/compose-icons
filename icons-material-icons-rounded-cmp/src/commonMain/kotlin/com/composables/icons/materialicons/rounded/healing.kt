package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Healing: ImageVector
    get() {
        if (_Healing != null) return _Healing!!
        
        _Healing = ImageVector.Builder(
            name = "healing",
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
                moveTo(17.73f, 12.02f)
                lineToRelative(3.98f, -3.98f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-4.34f, -4.34f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.98f, 3.98f)
                lineTo(8f, 2.29f)
                curveTo(7.8f, 2.1f, 7.55f, 2f, 7.29f, 2f)
                curveToRelative(-0.25f, 0f, -0.51f, 0.1f, -0.7f, 0.29f)
                lineTo(2.25f, 6.63f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.98f, 3.98f)
                lineTo(2.25f, 16f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.34f, 4.34f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.98f, -3.98f)
                lineToRelative(3.98f, 3.98f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.34f, -4.34f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.99f, -3.98f)
                close()
                moveTo(12f, 9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(-4.71f, 1.96f)
                lineTo(3.66f, 7.34f)
                lineToRelative(3.63f, -3.63f)
                lineToRelative(3.62f, 3.62f)
                lineToRelative(-3.62f, 3.63f)
                close()
                moveTo(10f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(2f, 2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(2f, -4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(2.66f, 9.34f)
                lineToRelative(-3.63f, -3.62f)
                lineToRelative(3.63f, -3.63f)
                lineToRelative(3.62f, 3.62f)
                lineToRelative(-3.62f, 3.63f)
                close()
            }
        }.build()
        
        return _Healing!!
    }

private var _Healing: ImageVector? = null

