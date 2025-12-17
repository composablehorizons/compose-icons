package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Fulcrum: ImageVector
    get() {
        if (_Fulcrum != null) return _Fulcrum!!
        
        _Fulcrum = ImageVector.Builder(
            name = "fulcrum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(95.75f, 164.14f)
                lineToRelative(-35.38f, 43.55f)
                lineTo(25f, 164.14f)
                lineToRelative(35.38f, -43.55f)
                close()
                moveTo(144.23f, 0f)
                lineToRelative(-20.54f, 198.18f)
                lineTo(72.72f, 256f)
                lineToRelative(51f, 57.82f)
                lineTo(144.23f, 512f)
                verticalLineTo(300.89f)
                lineTo(103.15f, 256f)
                lineToRelative(41.08f, -44.89f)
                close()
                moveToRelative(79.67f, 164.14f)
                lineToRelative(35.38f, 43.55f)
                lineToRelative(35.38f, -43.55f)
                lineToRelative(-35.38f, -43.55f)
                close()
                moveToRelative(-48.48f, 47f)
                lineTo(216.5f, 256f)
                lineToRelative(-41.08f, 44.89f)
                verticalLineTo(512f)
                lineTo(196f, 313.82f)
                lineTo(247f, 256f)
                lineToRelative(-51f, -57.82f)
                lineTo(175.42f, 0f)
                close()
            }
        }.build()
        
        return _Fulcrum!!
    }

private var _Fulcrum: ImageVector? = null

