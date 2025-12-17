package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Waving_hand: ImageVector
    get() {
        if (_Waving_hand != null) return _Waving_hand!!
        
        _Waving_hand = ImageVector.Builder(
            name = "waving_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 17f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                horizontalLineTo(23f)
                close()
                moveTo(1f, 7f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                verticalLineToRelative(1.5f)
                curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7f)
                horizontalLineTo(1f)
                close()
                moveTo(8.9f, 3.43f)
                lineTo(3.42f, 8.91f)
                curveToRelative(-3.22f, 3.22f, -3.22f, 8.44f, 0f, 11.67f)
                reflectiveCurveToRelative(8.44f, 3.22f, 11.67f, 0f)
                lineToRelative(7.95f, -7.95f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-5.3f, 5.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(7.42f, -7.42f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-6.72f, 6.72f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(7.78f, -7.78f)
                lineTo(19.5f, 2.73f)
                lineToRelative(-7.78f, 7.78f)
                lineTo(11.02f, 9.8f)
                lineToRelative(6.36f, -6.36f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-8.51f, 8.51f)
                curveToRelative(1.22f, 1.57f, 1.11f, 3.84f, -0.33f, 5.28f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.08f, 0f, -4.24f)
                lineToRelative(-0.35f, -0.35f)
                lineToRelative(4.95f, -4.95f)
                lineTo(8.9f, 3.43f)
                close()
            }
        }.build()
        
        return _Waving_hand!!
    }

private var _Waving_hand: ImageVector? = null

