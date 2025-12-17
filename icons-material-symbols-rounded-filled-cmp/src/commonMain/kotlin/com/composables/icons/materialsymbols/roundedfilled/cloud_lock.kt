package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cloud_lock: ImageVector
    get() {
        if (_Cloud_lock != null) return _Cloud_lock!!
        
        _Cloud_lock = ImageVector.Builder(
            name = "cloud_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 800f)
                quadToRelative(-91f, 0f, -155.5f, -63f)
                reflectiveQuadTo(40f, 583f)
                quadToRelative(0f, -78f, 47f, -139f)
                reflectiveQuadToRelative(123f, -78f)
                quadToRelative(25f, -92f, 100f, -149f)
                reflectiveQuadToRelative(170f, -57f)
                quadToRelative(98f, 0f, 172.5f, 58.5f)
                reflectiveQuadTo(751f, 368f)
                quadToRelative(3f, 13f, -4.5f, 23f)
                reflectiveQuadTo(725f, 403f)
                quadToRelative(-72f, 13f, -118.5f, 68.5f)
                reflectiveQuadTo(560f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineTo(260f)
                close()
                moveToRelative(420f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 760f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 600f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 560f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(680f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Cloud_lock!!
    }

private var _Cloud_lock: ImageVector? = null

