package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bucket_check: ImageVector
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
                lineToRelative(-70f, -491f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                lineToRelative(-70f, 491f)
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
                moveToRelative(226f, 320f)
                lineToRelative(198f, -198f)
                lineToRelative(-57f, -56f)
                lineToRelative(-141f, 141f)
                lineToRelative(-57f, -57f)
                lineToRelative(-57f, 57f)
                lineToRelative(114f, 113f)
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

