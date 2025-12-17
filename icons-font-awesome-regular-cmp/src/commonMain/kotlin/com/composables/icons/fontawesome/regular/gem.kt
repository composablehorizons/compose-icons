package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Gem: ImageVector
    get() {
        if (_Gem != null) return _Gem!!
        
        _Gem = ImageVector.Builder(
            name = "gem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 0f)
                horizontalLineTo(112f)
                curveToRelative(-4f, 0f, -7.8f, 2f, -10f, 5.4f)
                lineTo(2f, 152.6f)
                curveToRelative(-2.9f, 4.4f, -2.6f, 10.2f, 0.7f, 14.2f)
                lineToRelative(276f, 340.8f)
                curveToRelative(4.8f, 5.9f, 13.8f, 5.9f, 18.6f, 0f)
                lineToRelative(276f, -340.8f)
                curveToRelative(3.3f, -4.1f, 3.6f, -9.8f, 0.7f, -14.2f)
                lineTo(474.1f, 5.4f)
                curveTo(471.8f, 2f, 468.1f, 0f, 464f, 0f)
                close()
                moveToRelative(-19.3f, 48f)
                lineToRelative(63.3f, 96f)
                horizontalLineToRelative(-68.4f)
                lineToRelative(-51.7f, -96f)
                horizontalLineToRelative(56.8f)
                close()
                moveToRelative(-202.1f, 0f)
                horizontalLineToRelative(90.7f)
                lineToRelative(51.7f, 96f)
                horizontalLineTo(191f)
                lineToRelative(51.6f, -96f)
                close()
                moveToRelative(-111.3f, 0f)
                horizontalLineToRelative(56.8f)
                lineToRelative(-51.7f, 96f)
                horizontalLineTo(68f)
                lineToRelative(63.3f, -96f)
                close()
                moveToRelative(-43f, 144f)
                horizontalLineToRelative(51.4f)
                lineTo(208f, 352f)
                lineTo(88.3f, 192f)
                close()
                moveToRelative(102.9f, 0f)
                horizontalLineToRelative(193.6f)
                lineTo(288f, 435.3f)
                lineTo(191.2f, 192f)
                close()
                moveTo(368f, 352f)
                lineToRelative(68.2f, -160f)
                horizontalLineToRelative(51.4f)
                lineTo(368f, 352f)
                close()
            }
        }.build()
        
        return _Gem!!
    }

private var _Gem: ImageVector? = null

