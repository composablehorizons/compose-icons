package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CapsulePill: ImageVector
    get() {
        if (_CapsulePill != null) return _CapsulePill!!
        
        _CapsulePill = ImageVector.Builder(
            name = "capsule-pill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.02f, 5.364f)
                arcToRelative(3f, 3f, 0f, false, false, -4.242f, -4.243f)
                lineTo(1.121f, 6.778f)
                arcToRelative(3f, 3f, 0f, true, false, 4.243f, 4.243f)
                lineToRelative(5.657f, -5.657f)
                close()
                moveToRelative(-6.413f, -0.657f)
                lineToRelative(2.878f, -2.879f)
                arcToRelative(2f, 2f, 0f, true, true, 2.829f, 2.829f)
                lineTo(7.435f, 7.536f)
                close()
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, 8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -8f)
                moveToRelative(-0.5f, 1.042f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 5.917f)
                close()
                moveToRelative(1f, 5.917f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -5.917f)
                close()
            }
        }.build()
        
        return _CapsulePill!!
    }

private var _CapsulePill: ImageVector? = null

