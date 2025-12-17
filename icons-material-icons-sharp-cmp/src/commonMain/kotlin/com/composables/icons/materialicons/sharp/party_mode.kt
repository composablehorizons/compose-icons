package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Party_mode: ImageVector
    get() {
        if (_Party_mode != null) return _Party_mode!!
        
        _Party_mode = ImageVector.Builder(
            name = "party_mode",
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
                moveTo(22f, 4f)
                horizontalLineToRelative(-5.17f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.17f, 4f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveTo(12f, 7f)
                curveToRelative(1.63f, 0f, 3.06f, 0.79f, 3.98f, 2f)
                horizontalLineTo(12f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.35f, 0.07f, 0.69f, 0.18f, 1f)
                horizontalLineTo(7.1f)
                curveToRelative(-0.06f, -0.32f, -0.1f, -0.66f, -0.1f, -1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveToRelative(0f, 10f)
                curveToRelative(-1.63f, 0f, -3.06f, -0.79f, -3.98f, -2f)
                horizontalLineTo(12f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.35f, -0.07f, -0.69f, -0.18f, -1f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.07f, 0.32f, 0.1f, 0.66f, 0.1f, 1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
            }
        }.build()
        
        return _Party_mode!!
    }

private var _Party_mode: ImageVector? = null

