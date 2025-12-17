package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Report_off: ImageVector
    get() {
        if (_Report_off != null) return _Report_off!!
        
        _Report_off = ImageVector.Builder(
            name = "report_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 932f)
                lineTo(678f, 790f)
                lineToRelative(-48f, 50f)
                horizontalLineTo(330f)
                lineTo(120f, 628f)
                verticalLineToRelative(-298f)
                lineToRelative(48f, -48f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-28f, -254f)
                lineTo(520f, 408f)
                verticalLineToRelative(-128f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(48f)
                lineTo(282f, 168f)
                lineToRelative(48f, -48f)
                horizontalLineToRelative(300f)
                lineToRelative(210f, 210f)
                verticalLineToRelative(298f)
                lineToRelative(-48f, 50f)
                close()
                moveToRelative(-312f, 2f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 640f)
                verticalLineToRelative(-6f)
                lineToRelative(-34f, -34f)
                horizontalLineToRelative(-6f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Report_off!!
    }

private var _Report_off: ImageVector? = null

