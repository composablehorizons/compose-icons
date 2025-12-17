package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Beenhere: ImageVector
    get() {
        if (_Beenhere != null) return _Beenhere!!
        
        _Beenhere = ImageVector.Builder(
            name = "beenhere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                lineTo(192f, 704f)
                quadToRelative(-15f, -11f, -23.5f, -28f)
                reflectiveQuadToRelative(-8.5f, -36f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 19f, -8.5f, 36f)
                reflectiveQuadTo(768f, 704f)
                lineTo(480f, 920f)
                close()
                moveToRelative(0f, -100f)
                lineToRelative(240f, -180f)
                verticalLineToRelative(-480f)
                horizontalLineTo(240f)
                verticalLineToRelative(480f)
                lineToRelative(240f, 180f)
                close()
                moveToRelative(-42f, -220f)
                lineToRelative(226f, -226f)
                lineToRelative(-56f, -58f)
                lineToRelative(-170f, 170f)
                lineToRelative(-84f, -84f)
                lineToRelative(-58f, 56f)
                lineToRelative(142f, 142f)
                close()
                moveToRelative(42f, -440f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Beenhere!!
    }

private var _Beenhere: ImageVector? = null

