package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CapsuleHorizontal: ImageVector
    get() {
        if (_CapsuleHorizontal != null) return _CapsuleHorizontal!!
        
        _CapsuleHorizontal = ImageVector.Builder(
            name = "capsule-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 5f)
                horizontalLineToRelative(-6f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, 14f)
                horizontalLineToRelative(6f)
                arcToRelative(7f, 7f, 0f, false, false, 7f, -7f)
                lineToRelative(-0.007f, -0.303f)
                arcToRelative(7f, 7f, 0f, false, false, -6.993f, -6.697f)
                close()
            }
        }.build()
        
        return _CapsuleHorizontal!!
    }

private var _CapsuleHorizontal: ImageVector? = null

