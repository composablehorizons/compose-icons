package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Chalet: ImageVector
    get() {
        if (_Chalet != null) return _Chalet!!
        
        _Chalet = ImageVector.Builder(
            name = "chalet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 440f)
                verticalLineToRelative(-48f)
                lineToRelative(-30f, 30f)
                lineToRelative(-28f, -28f)
                lineToRelative(58f, -58f)
                verticalLineToRelative(-36f)
                horizontalLineToRelative(-36f)
                lineToRelative(-58f, 58f)
                lineToRelative(-28f, -28f)
                lineToRelative(30f, -30f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(48f)
                lineToRelative(-30f, -30f)
                lineToRelative(28f, -28f)
                lineToRelative(58f, 58f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-36f)
                lineToRelative(-58f, -58f)
                lineToRelative(28f, -28f)
                lineToRelative(30f, 30f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(48f)
                lineToRelative(30f, -30f)
                lineToRelative(28f, 28f)
                lineToRelative(-58f, 58f)
                verticalLineToRelative(36f)
                horizontalLineToRelative(36f)
                lineToRelative(58f, -58f)
                lineToRelative(28f, 28f)
                lineToRelative(-30f, 30f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-48f)
                lineToRelative(30f, 30f)
                lineToRelative(-28f, 28f)
                lineToRelative(-58f, -58f)
                horizontalLineToRelative(-36f)
                verticalLineToRelative(36f)
                lineToRelative(58f, 58f)
                lineToRelative(-28f, 28f)
                lineToRelative(-30f, -30f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-56f, 217f)
                lineToRelative(-44f, -44f)
                verticalLineToRelative(187f)
                horizontalLineTo(200f)
                verticalLineToRelative(-188f)
                lineToRelative(-44f, 44f)
                lineToRelative(-56f, -56f)
                lineToRelative(300f, -300f)
                lineToRelative(300f, 300f)
                lineToRelative(-56f, 57f)
                close()
                moveToRelative(-364f, 63f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-187f)
                lineTo(400f, 413f)
                lineTo(280f, 533f)
                verticalLineToRelative(187f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Chalet!!
    }

private var _Chalet: ImageVector? = null

