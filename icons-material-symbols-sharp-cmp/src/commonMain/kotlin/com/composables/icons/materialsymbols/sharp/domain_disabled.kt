package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Domain_disabled: ImageVector
    get() {
        if (_Domain_disabled != null) return _Domain_disabled!!
        
        _Domain_disabled = ImageVector.Builder(
            name = "domain_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 766f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-326f)
                horizontalLineTo(474f)
                lineToRelative(-74f, -74f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(-86f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(246f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(486f)
                close()
                moveTo(820f, 932f)
                lineToRelative(-94f, -92f)
                horizontalLineTo(80f)
                verticalLineToRelative(-648f)
                lineToRelative(-52f, -52f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(160f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 160f)
                horizontalLineToRelative(166f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-86f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(240f, -240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Domain_disabled!!
    }

private var _Domain_disabled: ImageVector? = null

