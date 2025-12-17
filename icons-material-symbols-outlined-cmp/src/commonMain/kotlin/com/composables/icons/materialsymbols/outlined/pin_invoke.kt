package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pin_invoke: ImageVector
    get() {
        if (_Pin_invoke != null) return _Pin_invoke!!
        
        _Pin_invoke = ImageVector.Builder(
            name = "pin_invoke",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(242f, -145f)
                lineToRelative(-56f, -57f)
                lineToRelative(118f, -118f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(226f)
                verticalLineToRelative(226f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-89f)
                lineTo(402f, 655f)
                close()
                moveToRelative(358f, -255f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Pin_invoke!!
    }

private var _Pin_invoke: ImageVector? = null

