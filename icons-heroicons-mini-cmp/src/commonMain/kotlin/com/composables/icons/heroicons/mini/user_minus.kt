package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.UserMinus: ImageVector
    get() {
        if (_UserMinus != null) return _UserMinus!!
        
        _UserMinus = ImageVector.Builder(
            name = "user-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
                moveTo(2.046f, 15.253f)
                curveToRelative(-0.058f, 0.468f, 0.172f, 0.92f, 0.57f, 1.175f)
                arcTo(9.953f, 9.953f, 0f, false, false, 8f, 18f)
                curveToRelative(1.982f, 0f, 3.83f, -0.578f, 5.384f, -1.573f)
                curveToRelative(0.398f, -0.254f, 0.628f, -0.707f, 0.57f, -1.175f)
                arcToRelative(6.001f, 6.001f, 0f, false, false, -11.908f, 0f)
                close()
                moveTo(12.75f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                close()
            }
        }.build()
        
        return _UserMinus!!
    }

private var _UserMinus: ImageVector? = null

