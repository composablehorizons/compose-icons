package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Capsule: ImageVector
    get() {
        if (_Capsule != null) return _Capsule!!
        
        _Capsule = ImageVector.Builder(
            name = "capsule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(-0.243f, 0.004f)
                arcToRelative(7.004f, 7.004f, 0f, false, false, -6.757f, 6.996f)
                verticalLineToRelative(6f)
                arcToRelative(7f, 7f, 0f, false, false, 7f, 7f)
                lineToRelative(0.243f, -0.004f)
                arcToRelative(7.004f, 7.004f, 0f, false, false, 6.757f, -6.996f)
                verticalLineToRelative(-6f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, -7f)
                close()
            }
        }.build()
        
        return _Capsule!!
    }

private var _Capsule: ImageVector? = null

