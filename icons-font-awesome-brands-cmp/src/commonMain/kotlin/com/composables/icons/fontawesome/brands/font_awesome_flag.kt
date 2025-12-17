package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FontAwesomeFlag: ImageVector
    get() {
        if (_FontAwesomeFlag != null) return _FontAwesomeFlag!!
        
        _FontAwesomeFlag = ImageVector.Builder(
            name = "font-awesome-flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 48f)
                verticalLineTo(384f)
                curveToRelative(-63f, 23f, -82f, 32f, -119f, 32f)
                curveToRelative(-63f, 0f, -87f, -32f, -150f, -32f)
                curveToRelative(-20f, 0f, -36f, 4f, -51f, 8f)
                verticalLineTo(328f)
                curveToRelative(15f, -4f, 31f, -8f, 51f, -8f)
                curveToRelative(63f, 0f, 87f, 32f, 150f, 32f)
                curveToRelative(20f, 0f, 35f, -3f, 55f, -9f)
                verticalLineTo(135f)
                curveToRelative(-20f, 6f, -35f, 9f, -55f, 9f)
                curveToRelative(-63f, 0f, -87f, -32f, -150f, -32f)
                curveToRelative(-51f, 0f, -75f, 21f, -115f, 29f)
                verticalLineTo(448f)
                arcToRelative(31.6f, 31.6f, 0f, false, true, -32f, 32f)
                arcTo(31.6f, 31.6f, 0f, false, true, 0f, 448f)
                verticalLineTo(64f)
                arcTo(31.6f, 31.6f, 0f, false, true, 32f, 32f)
                arcTo(31.6f, 31.6f, 0f, false, true, 64f, 64f)
                verticalLineTo(77f)
                curveToRelative(40f, -8f, 64f, -29f, 115f, -29f)
                curveToRelative(63f, 0f, 87f, 32f, 150f, 32f)
                curveTo(366f, 80f, 385f, 71f, 448f, 48f)
                close()
            }
        }.build()
        
        return _FontAwesomeFlag!!
    }

private var _FontAwesomeFlag: ImageVector? = null

