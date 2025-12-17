package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Prayer_times: ImageVector
    get() {
        if (_Prayer_times != null) return _Prayer_times!!
        
        _Prayer_times = ImageVector.Builder(
            name = "prayer_times",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 932f)
                lineTo(346f, 800f)
                horizontalLineTo(160f)
                verticalLineToRelative(-186f)
                lineTo(28f, 480f)
                lineToRelative(132f, -134f)
                verticalLineToRelative(-186f)
                horizontalLineToRelative(186f)
                lineToRelative(134f, -132f)
                lineToRelative(134f, 132f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(186f)
                lineToRelative(132f, 134f)
                lineToRelative(-132f, 134f)
                verticalLineToRelative(186f)
                horizontalLineTo(614f)
                lineTo(480f, 932f)
                close()
                moveToRelative(41f, -472f)
                lineToRelative(59f, -43f)
                lineToRelative(58f, 43f)
                lineToRelative(-23f, -68f)
                lineToRelative(59f, -43f)
                horizontalLineToRelative(-72f)
                lineToRelative(-22f, -69f)
                lineToRelative(-22f, 69f)
                horizontalLineToRelative(-73f)
                lineToRelative(59f, 43f)
                lineToRelative(-23f, 68f)
                close()
                moveToRelative(-41f, 220f)
                quadToRelative(83f, 0f, 141.5f, -58f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -8f, -0.5f, -16f)
                reflectiveQuadToRelative(-2.5f, -16f)
                quadToRelative(-11f, 47f, -49f, 77.5f)
                reflectiveQuadTo(539f, 556f)
                quadToRelative(-60f, 0f, -101f, -41f)
                reflectiveQuadToRelative(-41f, -101f)
                quadToRelative(0f, -46f, 26f, -82.5f)
                reflectiveQuadToRelative(68f, -51.5f)
                horizontalLineToRelative(-11f)
                quadToRelative(-84f, 0f, -142f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 84f, 58f, 142f)
                reflectiveQuadToRelative(142f, 58f)
                close()
            }
        }.build()
        
        return _Prayer_times!!
    }

private var _Prayer_times: ImageVector? = null

