package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Power: ImageVector
    get() {
        if (_Power != null) return _Power!!
        
        _Power = ImageVector.Builder(
            name = "power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 8.812f)
                arcToRelative(5f, 5f, 0f, false, true, 2.578f, -4.375f)
                lineToRelative(-0.485f, -0.874f)
                arcTo(6f, 6f, 0f, true, false, 11f, 3.616f)
                lineToRelative(-0.501f, 0.865f)
                arcTo(5f, 5f, 0f, true, true, 3f, 8.812f)
            }
        }.build()
        
        return _Power!!
    }

private var _Power: ImageVector? = null

