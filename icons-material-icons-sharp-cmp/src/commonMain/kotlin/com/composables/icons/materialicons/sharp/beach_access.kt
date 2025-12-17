package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Beach_access: ImageVector
    get() {
        if (_Beach_access != null) return _Beach_access!!
        
        _Beach_access = ImageVector.Builder(
            name = "beach_access",
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
                moveTo(5.95f, 5.98f)
                curveToRelative(-3.94f, 3.95f, -3.93f, 10.35f, 0.02f, 14.3f)
                lineToRelative(2.86f, -2.86f)
                curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 5.98f)
                close()
                moveToRelative(11.47f, 2.85f)
                lineToRelative(2.86f, -2.86f)
                curveToRelative(-3.95f, -3.95f, -10.35f, -3.96f, -14.3f, -0.02f)
                curveToRelative(3.93f, -1.3f, 8.31f, -0.25f, 11.44f, 2.88f)
                close()
                moveTo(5.97f, 5.96f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.38f, 3.01f, 1.17f, 6.88f, 4.3f, 10.02f)
                lineToRelative(5.73f, -5.73f)
                curveToRelative(-3.13f, -3.13f, -7.01f, -4.68f, -10.02f, -4.3f)
                close()
                moveToRelative(7.156f, 8.6f)
                lineToRelative(1.428f, -1.428f)
                lineToRelative(6.442f, 6.442f)
                lineToRelative(-1.43f, 1.428f)
                close()
            }
        }.build()
        
        return _Beach_access!!
    }

private var _Beach_access: ImageVector? = null

