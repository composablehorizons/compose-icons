package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.User_attributes: ImageVector
    get() {
        if (_User_attributes != null) return _User_attributes!!
        
        _User_attributes = ImageVector.Builder(
            name = "user_attributes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-240f, -40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 10f, -40f)
                reflectiveQuadToRelative(28f, -30f)
                quadToRelative(45f, -27f, 95.5f, -40.5f)
                reflectiveQuadTo(320f, 600f)
                quadToRelative(56f, 0f, 106.5f, 13.5f)
                reflectiveQuadTo(522f, 654f)
                quadToRelative(18f, 11f, 28f, 30f)
                reflectiveQuadToRelative(10f, 40f)
                verticalLineToRelative(76f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _User_attributes!!
    }

private var _User_attributes: ImageVector? = null

