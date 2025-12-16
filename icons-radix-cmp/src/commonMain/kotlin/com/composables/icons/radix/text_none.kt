package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TextNone: ImageVector
    get() {
        if (_TextNone != null) return _TextNone!!
        
        _TextNone = ImageVector.Builder(
            name = "text-none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.6464f, 1.64645f)
                curveTo(12.8417f, 1.45118f, 13.1582f, 1.45118f, 13.3535f, 1.64645f)
                curveTo(13.5487f, 1.84171f, 13.5487f, 2.15822f, 13.3535f, 2.35348f)
                lineTo(8.04977f, 7.65719f)
                verticalLineTo(12.0498f)
                horizontalLineTo(9.25387f)
                curveTo(9.50232f, 12.0498f, 9.70393f, 12.2515f, 9.70406f, 12.5f)
                curveTo(9.70398f, 12.7173f, 9.54958f, 12.8984f, 9.34469f, 12.9404f)
                lineTo(9.25387f, 12.9502f)
                horizontalLineTo(5.75387f)
                lineTo(5.66305f, 12.9404f)
                curveTo(5.4584f, 12.8982f, 5.30376f, 12.7171f, 5.30367f, 12.5f)
                curveTo(5.30379f, 12.2828f, 5.4584f, 12.1017f, 5.66305f, 12.0595f)
                lineTo(5.75387f, 12.0498f)
                horizontalLineTo(6.95016f)
                verticalLineTo(8.7568f)
                lineTo(2.35348f, 13.3535f)
                curveTo(2.15822f, 13.5487f, 1.84171f, 13.5487f, 1.64645f, 13.3535f)
                curveTo(1.45118f, 13.1582f, 1.45118f, 12.8417f, 1.64645f, 12.6464f)
                lineTo(6.95016f, 7.34274f)
                verticalLineTo(2.95016f)
                horizontalLineTo(3.95016f)
                verticalLineTo(4.49996f)
                curveTo(3.95003f, 4.74832f, 3.74832f, 4.95005f, 3.49996f, 4.95016f)
                curveTo(3.25162f, 4.95003f, 3.04989f, 4.7483f, 3.04977f, 4.49996f)
                verticalLineTo(2.49996f)
                curveTo(3.0498f, 2.44543f, 3.06028f, 2.39307f, 3.07809f, 2.34469f)
                curveTo(3.07968f, 2.34029f, 3.08025f, 2.33534f, 3.08199f, 2.33102f)
                curveTo(3.08709f, 2.31846f, 3.09439f, 2.30685f, 3.10055f, 2.29488f)
                curveTo(3.10701f, 2.28228f, 3.11347f, 2.26965f, 3.12106f, 2.25777f)
                curveTo(3.12774f, 2.24734f, 3.13504f, 2.23733f, 3.14254f, 2.2275f)
                curveTo(3.1483f, 2.21994f, 3.1539f, 2.21222f, 3.16012f, 2.20504f)
                lineTo(3.1816f, 2.1816f)
                curveTo(3.18617f, 2.17704f, 3.19149f, 2.17327f, 3.19625f, 2.16891f)
                curveTo(3.20815f, 2.15795f, 3.22033f, 2.14729f, 3.23336f, 2.13766f)
                curveTo(3.24243f, 2.13097f, 3.25211f, 2.12511f, 3.26168f, 2.1191f)
                curveTo(3.27424f, 2.11121f, 3.28739f, 2.10426f, 3.30074f, 2.09762f)
                curveTo(3.31203f, 2.09202f, 3.32313f, 2.08568f, 3.33492f, 2.08102f)
                curveTo(3.35033f, 2.07493f, 3.36659f, 2.07074f, 3.38277f, 2.06637f)
                curveTo(3.39312f, 2.06358f, 3.40341f, 2.05965f, 3.41402f, 2.05758f)
                curveTo(3.44169f, 2.05223f, 3.47073f, 2.04978f, 3.49996f, 2.04977f)
                horizontalLineTo(11.5f)
                lineTo(11.5791f, 2.0566f)
                curveTo(11.5822f, 2.05717f, 11.5857f, 2.05792f, 11.5888f, 2.05856f)
                lineTo(11.5908f, 2.05953f)
                curveTo(11.596f, 2.0606f, 11.6013f, 2.06218f, 11.6064f, 2.06344f)
                curveTo(11.624f, 2.06773f, 11.6415f, 2.07277f, 11.6582f, 2.07906f)
                curveTo(11.6708f, 2.08382f, 11.6832f, 2.08983f, 11.6953f, 2.09567f)
                curveTo(11.7046f, 2.10022f, 11.7146f, 2.10419f, 11.7236f, 2.10934f)
                lineTo(11.7334f, 2.1152f)
                curveTo(11.7387f, 2.11842f, 11.7438f, 2.12249f, 11.749f, 2.12594f)
                curveTo(11.7834f, 2.14902f, 11.8149f, 2.17652f, 11.8418f, 2.20797f)
                curveTo(11.8803f, 2.25299f, 11.9091f, 2.30641f, 11.9277f, 2.36422f)
                lineTo(12.6464f, 1.64645f)
                close()
                moveTo(8.04977f, 6.24313f)
                lineTo(11.0498f, 3.24313f)
                verticalLineTo(2.95016f)
                horizontalLineTo(8.04977f)
                verticalLineTo(6.24313f)
                close()
            }
        }.build()
        
        return _TextNone!!
    }

private var _TextNone: ImageVector? = null

