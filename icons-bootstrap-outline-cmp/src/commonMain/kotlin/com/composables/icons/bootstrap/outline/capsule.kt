package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Capsule: ImageVector
    get() {
        if (_Capsule != null) return _Capsule!!
        
        _Capsule = ImageVector.Builder(
            name = "capsule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.828f, 8.9f)
                lineTo(8.9f, 1.827f)
                arcToRelative(4f, 4f, 0f, true, true, 5.657f, 5.657f)
                lineToRelative(-7.07f, 7.071f)
                arcTo(4f, 4f, 0f, true, true, 1.827f, 8.9f)
                close()
                moveToRelative(9.128f, 0.771f)
                lineToRelative(2.893f, -2.893f)
                arcToRelative(3f, 3f, 0f, true, false, -4.243f, -4.242f)
                lineTo(6.713f, 5.429f)
                close()
            }
        }.build()
        
        return _Capsule!!
    }

private var _Capsule: ImageVector? = null

