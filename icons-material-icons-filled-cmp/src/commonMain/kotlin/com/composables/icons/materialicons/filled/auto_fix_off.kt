package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Auto_fix_off: ImageVector
    get() {
        if (_Auto_fix_off != null) return _Auto_fix_off!!
        
        _Auto_fix_off = ImageVector.Builder(
            name = "auto_fix_off",
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
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 1f)
                lineToRelative(-2.5f, 1.4f)
                lineTo(18f, 1f)
                lineToRelative(1.4f, 2.5f)
                lineTo(18f, 6f)
                lineToRelative(2.5f, -1.4f)
                lineTo(23f, 6f)
                lineToRelative(-1.4f, -2.5f)
                lineTo(23f, 1f)
                close()
                moveToRelative(-8.34f, 6.22f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(0.81f, 0.81f)
                lineToRelative(2.55f, -2.55f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(11.4f, 8.84f)
                lineToRelative(0.81f, 0.81f)
                lineToRelative(2.45f, -2.43f)
                close()
                moveToRelative(-0.78f, 6.65f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-6.86f, -6.86f)
                lineTo(2f, 4.53f)
                lineToRelative(6.86f, 6.86f)
                lineToRelative(-6.57f, 6.57f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.34f, 2.34f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(6.57f, -6.57f)
                lineTo(19.47f, 22f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-6.86f, -6.86f)
                close()
            }
        }.build()
        
        return _Auto_fix_off!!
    }

private var _Auto_fix_off: ImageVector? = null

