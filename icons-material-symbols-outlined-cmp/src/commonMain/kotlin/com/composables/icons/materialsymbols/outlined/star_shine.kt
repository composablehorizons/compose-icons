package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Star_shine: ImageVector
    get() {
        if (_Star_shine != null) return _Star_shine!!
        
        _Star_shine = ImageVector.Builder(
            name = "star_shine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(852f, 748f)
                lineTo(732f, 628f)
                lineToRelative(56f, -56f)
                lineToRelative(120f, 120f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(708f, 268f)
                lineToRelative(-56f, -56f)
                lineToRelative(120f, -120f)
                lineToRelative(56f, 56f)
                lineToRelative(-120f, 120f)
                close()
                moveToRelative(-456f, 0f)
                lineTo(132f, 148f)
                lineToRelative(56f, -56f)
                lineToRelative(120f, 120f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(108f, 748f)
                lineToRelative(-56f, -56f)
                lineToRelative(120f, -120f)
                lineToRelative(56f, 56f)
                lineToRelative(-120f, 120f)
                close()
                moveToRelative(246f, -75f)
                lineToRelative(126f, -76f)
                lineToRelative(126f, 77f)
                lineToRelative(-33f, -144f)
                lineToRelative(111f, -96f)
                lineToRelative(-146f, -13f)
                lineToRelative(-58f, -136f)
                lineToRelative(-58f, 135f)
                lineToRelative(-146f, 13f)
                lineToRelative(111f, 97f)
                lineToRelative(-33f, 143f)
                close()
                moveTo(233f, 840f)
                lineToRelative(65f, -281f)
                lineTo(80f, 370f)
                lineToRelative(288f, -25f)
                lineToRelative(112f, -265f)
                lineToRelative(112f, 265f)
                lineToRelative(288f, 25f)
                lineToRelative(-218f, 189f)
                lineToRelative(65f, 281f)
                lineToRelative(-247f, -149f)
                lineToRelative(-247f, 149f)
                close()
                moveToRelative(247f, -361f)
                close()
            }
        }.build()
        
        return _Star_shine!!
    }

private var _Star_shine: ImageVector? = null

