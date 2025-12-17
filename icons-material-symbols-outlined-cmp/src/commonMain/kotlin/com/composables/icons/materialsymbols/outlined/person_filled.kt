package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Person_filled: ImageVector
    get() {
        if (_Person_filled != null) return _Person_filled!!
        
        _Person_filled = ImageVector.Builder(
            name = "person_filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                quadToRelative(-1.65f, 0f, -2.825f, -1.175f)
                quadTo(8f, 9.65f, 8f, 8f)
                quadToRelative(0f, -1.65f, 1.175f, -2.825f)
                quadTo(10.35f, 4f, 12f, 4f)
                quadToRelative(1.65f, 0f, 2.825f, 1.175f)
                quadTo(16f, 6.35f, 16f, 8f)
                quadToRelative(0f, 1.65f, -1.175f, 2.825f)
                quadTo(13.65f, 12f, 12f, 12f)
                close()
                moveToRelative(-8f, 8f)
                verticalLineToRelative(-2.8f)
                quadToRelative(0f, -0.85f, 0.438f, -1.563f)
                quadToRelative(0.437f, -0.712f, 1.162f, -1.087f)
                quadToRelative(1.55f, -0.775f, 3.15f, -1.163f)
                quadTo(10.35f, 13f, 12f, 13f)
                reflectiveQuadToRelative(3.25f, 0.387f)
                quadToRelative(1.6f, 0.388f, 3.15f, 1.163f)
                quadToRelative(0.725f, 0.375f, 1.162f, 1.087f)
                quadTo(20f, 16.35f, 20f, 17.2f)
                verticalLineTo(20f)
                close()
                moveToRelative(2f, -2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.8f)
                quadToRelative(0f, -0.275f, -0.137f, -0.5f)
                quadToRelative(-0.138f, -0.225f, -0.363f, -0.35f)
                quadToRelative(-1.35f, -0.675f, -2.725f, -1.013f)
                quadTo(13.4f, 15f, 12f, 15f)
                reflectiveQuadToRelative(-2.775f, 0.337f)
                quadTo(7.85f, 15.675f, 6.5f, 16.35f)
                quadToRelative(-0.225f, 0.125f, -0.362f, 0.35f)
                quadToRelative(-0.138f, 0.225f, -0.138f, 0.5f)
                close()
                moveToRelative(6f, -8f)
                quadToRelative(0.825f, 0f, 1.413f, -0.588f)
                quadTo(14f, 8.825f, 14f, 8f)
                reflectiveQuadToRelative(-0.587f, -1.412f)
                quadTo(12.825f, 6f, 12f, 6f)
                quadToRelative(-0.825f, 0f, -1.412f, 0.588f)
                quadTo(10f, 7.175f, 10f, 8f)
                reflectiveQuadToRelative(0.588f, 1.412f)
                quadTo(11.175f, 10f, 12f, 10f)
                close()
                moveToRelative(0f, -2f)
                close()
                moveToRelative(0f, 10f)
                close()
            }
        }.build()
        
        return _Person_filled!!
    }

private var _Person_filled: ImageVector? = null

