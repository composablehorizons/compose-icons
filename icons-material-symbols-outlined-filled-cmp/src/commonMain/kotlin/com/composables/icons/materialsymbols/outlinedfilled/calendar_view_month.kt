package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Calendar_view_month: ImageVector
    get() {
        if (_Calendar_view_month != null) return _Calendar_view_month!!
        
        _Calendar_view_month = ImageVector.Builder(
            name = "calendar_view_month",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 420f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(133f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(333f, 240f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(293f, 460f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 420f)
                close()
                moveToRelative(293f, 40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(373f, 420f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(413f, 200f)
                horizontalLineToRelative(134f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(587f, 240f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(547f, 460f)
                horizontalLineTo(413f)
                close()
                moveToRelative(254f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(627f, 420f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(667f, 200f)
                horizontalLineToRelative(133f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 460f)
                horizontalLineTo(667f)
                close()
                moveTo(293f, 760f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 500f)
                horizontalLineToRelative(133f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(333f, 540f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(293f, 760f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(373f, 720f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(413f, 500f)
                horizontalLineToRelative(134f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(587f, 540f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(547f, 760f)
                horizontalLineTo(413f)
                close()
                moveToRelative(254f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(627f, 720f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(667f, 500f)
                horizontalLineToRelative(133f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 540f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(667f)
                close()
            }
        }.build()
        
        return _Calendar_view_month!!
    }

private var _Calendar_view_month: ImageVector? = null

