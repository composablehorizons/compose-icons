package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Comments_disabled: ImageVector
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
                moveTo(819f, 932f)
                lineTo(607f, 720f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-447f)
                lineToRelative(-53f, -53f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(61f, -167f)
                lineTo(675f, 560f)
                horizontalLineToRelative(45f)
                verticalLineToRelative(-80f)
                horizontalLineTo(595f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(165f)
                verticalLineToRelative(-80f)
                horizontalLineTo(475f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(285f)
                verticalLineToRelative(-80f)
                horizontalLineTo(355f)
                lineTo(195f, 80f)
                horizontalLineToRelative(605f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(605f)
                close()
                moveTo(240f, 560f)
                horizontalLineToRelative(207f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(87f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Comments_disabled!!
    }

private var _Comments_disabled: ImageVector? = null

