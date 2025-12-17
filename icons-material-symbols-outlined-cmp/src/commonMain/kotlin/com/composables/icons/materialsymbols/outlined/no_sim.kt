package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.No_sim: ImageVector
    get() {
        if (_No_sim != null) return _No_sim!!
        
        _No_sim = ImageVector.Builder(
            name = "no_sim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 687f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-447f)
                horizontalLineTo(434f)
                lineToRelative(-80f, 80f)
                lineToRelative(-58f, -56f)
                lineToRelative(104f, -104f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(527f)
                close()
                moveToRelative(20f, 245f)
                lineTo(240f, 352f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-81f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-480f)
                lineToRelative(24f, -24f)
                lineTo(28f, 140f)
                lineToRelative(57f, -56f)
                lineTo(876f, 875f)
                lineToRelative(-56f, 57f)
                close()
                moveTo(541f, 427f)
                close()
                moveToRelative(-75f, 152f)
                close()
            }
        }.build()
        
        return _No_sim!!
    }

private var _No_sim: ImageVector? = null

