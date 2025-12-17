package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Install_mobile: ImageVector
    get() {
        if (_Install_mobile != null) return _Install_mobile!!
        
        _Install_mobile = ImageVector.Builder(
            name = "install_mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(440f, -240f)
                lineTo(520f, 360f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                verticalLineToRelative(-288f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(288f)
                lineToRelative(104f, -104f)
                lineToRelative(56f, 56f)
                lineToRelative(-200f, 200f)
                close()
                moveTo(280f, 160f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Install_mobile!!
    }

private var _Install_mobile: ImageVector? = null

