package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Near_me_disabled: ImageVector
    get() {
        if (_Near_me_disabled != null) return _Near_me_disabled!!
        
        _Near_me_disabled = ImageVector.Builder(
            name = "near_me_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(516f, 840f)
                lineTo(402f, 558f)
                lineTo(120f, 444f)
                verticalLineToRelative(-56f)
                lineToRelative(195f, -73f)
                lineToRelative(-203f, -203f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                lineToRelative(-203f, -203f)
                lineToRelative(-73f, 195f)
                horizontalLineToRelative(-56f)
                close()
                moveToRelative(191f, -361f)
                lineToRelative(-63f, -63f)
                lineToRelative(60f, -160f)
                lineToRelative(-160f, 60f)
                lineToRelative(-63f, -63f)
                lineToRelative(359f, -133f)
                lineToRelative(-133f, 359f)
                close()
                moveTo(542f, 692f)
                lineToRelative(41f, -109f)
                lineToRelative(-206f, -206f)
                lineToRelative(-109f, 41f)
                lineToRelative(196f, 78f)
                lineToRelative(78f, 196f)
                close()
                moveToRelative(52f, -326f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Near_me_disabled!!
    }

private var _Near_me_disabled: ImageVector? = null

