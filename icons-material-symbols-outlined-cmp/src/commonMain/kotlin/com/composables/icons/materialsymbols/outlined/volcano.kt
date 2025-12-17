package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Volcano: ImageVector
    get() {
        if (_Volcano != null) return _Volcano!!
        
        _Volcano = ImageVector.Builder(
            name = "volcano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(160f, -360f)
                horizontalLineToRelative(120f)
                lineToRelative(80f, -200f)
                horizontalLineToRelative(280f)
                lineTo(880f, 880f)
                horizontalLineTo(80f)
                close()
                moveToRelative(123f, -80f)
                horizontalLineToRelative(571f)
                lineTo(660f, 400f)
                horizontalLineTo(494f)
                lineToRelative(-80f, 200f)
                horizontalLineTo(292f)
                lineToRelative(-89f, 200f)
                close()
                moveToRelative(317f, -600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(181f, 75f)
                lineToRelative(-56f, -56f)
                lineToRelative(113f, -113f)
                lineToRelative(57f, 56f)
                lineToRelative(-114f, 113f)
                close()
                moveToRelative(-282f, 0f)
                lineTo(306f, 162f)
                lineToRelative(56f, -57f)
                lineToRelative(113f, 114f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(355f, 525f)
                horizontalLineTo(203f)
                horizontalLineToRelative(571f)
                close()
            }
        }.build()
        
        return _Volcano!!
    }

private var _Volcano: ImageVector? = null

