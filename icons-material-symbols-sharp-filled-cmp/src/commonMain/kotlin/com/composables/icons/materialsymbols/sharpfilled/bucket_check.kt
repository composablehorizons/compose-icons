package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bucket_check: ImageVector
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
                moveTo(200f, 840f)
                lineToRelative(-80f, -560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, 560f)
                horizontalLineTo(200f)
                close()
                moveToRelative(238f, -160f)
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
            }
        }.build()
        
        return _Bucket_check!!
    }

private var _Bucket_check: ImageVector? = null

