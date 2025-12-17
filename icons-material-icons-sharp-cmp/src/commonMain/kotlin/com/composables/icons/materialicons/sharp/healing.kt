package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Healing: ImageVector
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
                moveTo(17.74f, 12.01f)
                lineToRelative(4.68f, -4.68f)
                lineToRelative(-5.75f, -5.75f)
                lineToRelative(-4.68f, 4.68f)
                lineTo(7.3f, 1.58f)
                lineTo(1.55f, 7.34f)
                lineToRelative(4.68f, 4.69f)
                lineToRelative(-4.68f, 4.68f)
                lineToRelative(5.75f, 5.75f)
                lineToRelative(4.68f, -4.68f)
                lineToRelative(4.69f, 4.69f)
                lineToRelative(5.76f, -5.76f)
                lineToRelative(-4.69f, -4.7f)
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

