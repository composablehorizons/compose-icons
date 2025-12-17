package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Cardboards: ImageVector
    get() {
        if (_Cardboards != null) return _Cardboards!!
        
        _Cardboards = ImageVector.Builder(
            name = "cardboards",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(8.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, 3.5f)
                horizontalLineToRelative(-1.062f)
                arcToRelative(4f, 4f, 0f, false, true, -3.118f, -1.504f)
                lineToRelative(-1.54f, -1.92f)
                arcToRelative(1f, 1f, 0f, false, false, -1.56f, 0f)
                lineToRelative(-1.538f, 1.917f)
                arcToRelative(4f, 4f, 0f, false, true, -3.122f, 1.507f)
                horizontalLineToRelative(-1.06f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, -3.5f)
                verticalLineToRelative(-8.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-11f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
                moveToRelative(8f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
            }
        }.build()
        
        return _Cardboards!!
    }

private var _Cardboards: ImageVector? = null

