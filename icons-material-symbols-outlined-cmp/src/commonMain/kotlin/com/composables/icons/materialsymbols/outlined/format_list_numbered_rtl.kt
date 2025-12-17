package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Format_list_numbered_rtl: ImageVector
    get() {
        if (_Format_list_numbered_rtl != null) return _Format_list_numbered_rtl!!
        
        _Format_list_numbered_rtl = ImageVector.Builder(
            name = "format_list_numbered_rtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-30f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 680f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 800f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(680f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-110f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 450f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-30f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 400f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 510f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(60f)
                horizontalLineTo(680f)
                close()
                moveToRelative(60f, -280f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(120f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Format_list_numbered_rtl!!
    }

private var _Format_list_numbered_rtl: ImageVector? = null

