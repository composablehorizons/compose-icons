package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Text_rotation_down: ImageVector
    get() {
        if (_Text_rotation_down != null) return _Text_rotation_down!!
        
        _Text_rotation_down = ImageVector.Builder(
            name = "text_rotation_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                lineTo(100f, 702f)
                lineToRelative(58f, -56f)
                lineToRelative(42f, 42f)
                verticalLineToRelative(-528f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(528f)
                lineToRelative(42f, -42f)
                lineToRelative(56f, 56f)
                lineToRelative(-138f, 138f)
                close()
                moveToRelative(160f, -156f)
                verticalLineToRelative(-76f)
                lineToRelative(112f, -38f)
                verticalLineToRelative(-178f)
                lineToRelative(-112f, -40f)
                verticalLineToRelative(-76f)
                lineToRelative(440f, 164f)
                verticalLineToRelative(80f)
                lineTo(400f, 684f)
                close()
                moveToRelative(176f, -138f)
                lineToRelative(182f, -64f)
                verticalLineToRelative(-4f)
                lineToRelative(-182f, -64f)
                verticalLineToRelative(132f)
                close()
            }
        }.build()
        
        return _Text_rotation_down!!
    }

private var _Text_rotation_down: ImageVector? = null

