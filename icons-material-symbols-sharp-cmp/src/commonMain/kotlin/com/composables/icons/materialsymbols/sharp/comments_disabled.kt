package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Comments_disabled: ImageVector
    get() {
        if (_Comments_disabled != null) return _Comments_disabled!!
        
        _Comments_disabled = ImageVector.Builder(
            name = "comments_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 720f)
                verticalLineToRelative(-527f)
                lineToRelative(-53f, -53f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-212f, -212f)
                horizontalLineTo(80f)
                close()
                moveToRelative(800f, 45f)
                lineTo(755f, 640f)
                horizontalLineToRelative(45f)
                verticalLineToRelative(-480f)
                horizontalLineTo(275f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(685f)
                verticalLineToRelative(685f)
                close()
                moveTo(160f, 640f)
                horizontalLineToRelative(367f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(127f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(-87f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(7f)
                lineToRelative(-87f, -87f)
                verticalLineToRelative(367f)
                close()
                moveToRelative(515f, -80f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(125f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-45f)
                close()
                moveTo(555f, 440f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(245f)
                verticalLineToRelative(80f)
                horizontalLineTo(555f)
                close()
                moveTo(435f, 320f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(365f)
                verticalLineToRelative(80f)
                horizontalLineTo(435f)
                close()
                moveToRelative(-91f, 136f)
                close()
                moveToRelative(171f, -56f)
                close()
            }
        }.build()
        
        return _Comments_disabled!!
    }

private var _Comments_disabled: ImageVector? = null

