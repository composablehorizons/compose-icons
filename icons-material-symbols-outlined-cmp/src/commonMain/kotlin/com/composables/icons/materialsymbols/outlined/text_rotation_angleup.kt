package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Text_rotation_angleup: ImageVector
    get() {
        if (_Text_rotation_angleup != null) return _Text_rotation_angleup!!
        
        _Text_rotation_angleup = ImageVector.Builder(
            name = "text_rotation_angleup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(389f, 868f)
                lineToRelative(-56f, -56f)
                lineToRelative(372f, -372f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-64f)
                lineTo(389f, 868f)
                close()
                moveToRelative(-60f, -224f)
                lineTo(135f, 216f)
                lineToRelative(56f, -56f)
                lineToRelative(428f, 196f)
                lineToRelative(-54f, 54f)
                lineToRelative(-106f, -52f)
                lineToRelative(-126f, 126f)
                lineToRelative(50f, 106f)
                lineToRelative(-54f, 54f)
                close()
                moveToRelative(-26f, -222f)
                lineToRelative(94f, -92f)
                lineToRelative(-174f, -84f)
                lineToRelative(-2f, 2f)
                lineToRelative(82f, 174f)
                close()
            }
        }.build()
        
        return _Text_rotation_angleup!!
    }

private var _Text_rotation_angleup: ImageVector? = null

