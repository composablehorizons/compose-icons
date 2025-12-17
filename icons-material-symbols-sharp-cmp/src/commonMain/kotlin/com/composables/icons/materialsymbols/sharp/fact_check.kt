package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fact_check: ImageVector
    get() {
        if (_Fact_check != null) return _Fact_check!!
        
        _Fact_check = ImageVector.Builder(
            name = "fact_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(382f, -80f)
                lineToRelative(198f, -198f)
                lineToRelative(-57f, -57f)
                lineToRelative(-141f, 142f)
                lineToRelative(-57f, -57f)
                lineToRelative(-56f, 57f)
                lineToRelative(113f, 113f)
                close()
                moveToRelative(-382f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(720f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-560f)
                horizontalLineTo(160f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Fact_check!!
    }

private var _Fact_check: ImageVector? = null

