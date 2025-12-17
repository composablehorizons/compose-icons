package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Party_mode: ImageVector
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
                moveToRelative(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.05f)
                lineToRelative(0.59f, -0.65f)
                lineTo(9.88f, 4f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.24f, 1.35f)
                lineToRelative(0.59f, 0.65f)
                horizontalLineTo(20f)
                verticalLineToRelative(12f)
                close()
                moveTo(9f, 12f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(3.98f)
                curveToRelative(-0.92f, -1.21f, -2.35f, -2f, -3.98f, -2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.34f, 0.04f, 0.68f, 0.1f, 1f)
                horizontalLineToRelative(2.08f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1f)
                close()
                moveToRelative(6f, 0f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineTo(8.02f)
                curveToRelative(0.92f, 1.21f, 2.35f, 2f, 3.98f, 2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -0.34f, -0.03f, -0.68f, -0.1f, -1f)
                horizontalLineToRelative(-2.08f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1f)
                close()
            }
        }.build()
        
        return _Party_mode!!
    }

private var _Party_mode: ImageVector? = null

