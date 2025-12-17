package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SuitDiamond: ImageVector
    get() {
        if (_SuitDiamond != null) return _SuitDiamond!!
        
        _SuitDiamond = ImageVector.Builder(
            name = "suit-diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.384f, 1.226f)
                arcToRelative(0.463f, 0.463f, 0f, false, false, -0.768f, 0f)
                lineToRelative(-4.56f, 6.468f)
                arcToRelative(0.54f, 0.54f, 0f, false, false, 0f, 0.612f)
                lineToRelative(4.56f, 6.469f)
                arcToRelative(0.463f, 0.463f, 0f, false, false, 0.768f, 0f)
                lineToRelative(4.56f, -6.469f)
                arcToRelative(0.54f, 0.54f, 0f, false, false, 0f, -0.612f)
                close()
                moveTo(6.848f, 0.613f)
                arcToRelative(1.39f, 1.39f, 0f, false, true, 2.304f, 0f)
                lineToRelative(4.56f, 6.468f)
                arcToRelative(1.61f, 1.61f, 0f, false, true, 0f, 1.838f)
                lineToRelative(-4.56f, 6.468f)
                arcToRelative(1.39f, 1.39f, 0f, false, true, -2.304f, 0f)
                lineTo(2.288f, 8.92f)
                arcToRelative(1.61f, 1.61f, 0f, false, true, 0f, -1.838f)
                close()
            }
        }.build()
        
        return _SuitDiamond!!
    }

private var _SuitDiamond: ImageVector? = null

