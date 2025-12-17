package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bucket_check: ImageVector
    get() {
        if (_Bucket_check != null) return _Bucket_check!!
        
        _Bucket_check = ImageVector.Builder(
            name = "bucket_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(269f, 840f)
                quadToRelative(-30f, 0f, -52f, -20f)
                reflectiveQuadToRelative(-27f, -49f)
                lineToRelative(-63f, -445f)
                quadToRelative(-2f, -18f, 9.5f, -32f)
                reflectiveQuadToRelative(29.5f, -14f)
                horizontalLineToRelative(74f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(73f)
                quadToRelative(18f, 0f, 30f, 14f)
                reflectiveQuadToRelative(10f, 32f)
                lineToRelative(-63f, 445f)
                quadToRelative(-5f, 29f, -27.5f, 49f)
                reflectiveQuadTo(690f, 840f)
                horizontalLineTo(269f)
                close()
                moveToRelative(-57f, -480f)
                lineToRelative(57f, 400f)
                horizontalLineToRelative(422f)
                lineToRelative(57f, -400f)
                horizontalLineTo(212f)
                close()
                moveToRelative(226f, 207f)
                lineToRelative(-29f, -29f)
                quadToRelative(-12f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(56f, 57f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(141f, -142f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(438f, 567f)
                close()
                moveTo(320f, 280f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 280f)
                close()
            }
        }.build()
        
        return _Bucket_check!!
    }

private var _Bucket_check: ImageVector? = null

