package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mitre: ImageVector
    get() {
        if (_Mitre != null) return _Mitre!!
        
        _Mitre = ImageVector.Builder(
            name = "mitre",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineTo(700f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 920f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineTo(340f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(240f)
                horizontalLineTo(340f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(420f, 280f)
                close()
                moveToRelative(0f, -320f)
                close()
                moveTo(300f, 800f)
                close()
                moveToRelative(0f, -320f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Mitre!!
    }

private var _Mitre: ImageVector? = null

