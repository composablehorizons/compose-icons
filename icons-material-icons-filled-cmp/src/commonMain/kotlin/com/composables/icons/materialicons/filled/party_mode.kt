package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Party_mode: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                horizontalLineToRelative(-3.17f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.17f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-8f, 3f)
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

