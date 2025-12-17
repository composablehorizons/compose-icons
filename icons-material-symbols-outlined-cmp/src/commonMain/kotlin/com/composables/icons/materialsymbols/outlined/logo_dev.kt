package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Logo_dev: ImageVector
    get() {
        if (_Logo_dev != null) return _Logo_dev!!
        
        _Logo_dev = ImageVector.Builder(
            name = "logo_dev",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 600f)
                horizontalLineToRelative(96f)
                quadToRelative(19f, 0f, 32.5f, -13.5f)
                reflectiveQuadTo(382f, 554f)
                verticalLineToRelative(-148f)
                quadToRelative(0f, -19f, -13.5f, -32.5f)
                reflectiveQuadTo(336f, 360f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(46f, -46f)
                verticalLineToRelative(-148f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(148f)
                horizontalLineToRelative(-50f)
                close()
                moveToRelative(149f, 46f)
                horizontalLineToRelative(98f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(-82f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(-52f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(82f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(-98f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(405f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(435f, 600f)
                close()
                moveToRelative(206f, -1f)
                quadToRelative(13f, 0f, 22.5f, -8.5f)
                reflectiveQuadTo(676f, 569f)
                lineToRelative(56f, -209f)
                horizontalLineToRelative(-48f)
                lineToRelative(-43f, 164f)
                lineToRelative(-43f, -164f)
                horizontalLineToRelative(-48f)
                lineToRelative(56f, 209f)
                quadToRelative(3f, 13f, 12.5f, 21.5f)
                reflectiveQuadTo(641f, 599f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Logo_dev!!
    }

private var _Logo_dev: ImageVector? = null

